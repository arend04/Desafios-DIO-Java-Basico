package one.arend.padroesprojetospring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.arend.padroesprojetospring.model.Cliente;
import one.arend.padroesprojetospring.model.ClienteRepository;
import one.arend.padroesprojetospring.model.Endereco;
import one.arend.padroesprojetospring.model.EnderecoRepository;
import one.arend.padroesprojetospring.service.ClienteService;
import one.arend.padroesprojetospring.service.ViaCepService;

/*Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 {@link Service}, ela será tratada como um <b>Singleton</b>. */

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;

   //
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			// Caso não exista, integrar com o ViaCEP e persistir o retorno.
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		// Inserir Cliente, vinculando o Endereco (novo ou existente).
		clienteRepository.save(cliente);
	}

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}

    


    


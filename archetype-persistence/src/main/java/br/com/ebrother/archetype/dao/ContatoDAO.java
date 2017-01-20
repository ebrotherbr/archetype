package br.com.ebrother.archetype.dao;

import org.springframework.stereotype.Repository;

import br.com.ebrother.archetype.model.Contato;
import br.com.ebrother.jeeframework.dao.AbstractDAO;

@Repository
public class ContatoDAO extends AbstractDAO<Contato, Long> {

}

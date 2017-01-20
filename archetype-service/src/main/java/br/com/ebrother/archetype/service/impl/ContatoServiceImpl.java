package br.com.ebrother.archetype.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ebrother.archetype.dao.ContatoDAO;
import br.com.ebrother.archetype.service.ContatoService;
import br.com.ebrother.jeeframework.service.AbstractService;

@Service
public class ContatoServiceImpl extends AbstractService implements ContatoService {

    @Autowired
    private ContatoDAO contatoDAO;

}

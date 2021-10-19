package xyz.grupojdd.libreriabackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import xyz.grupojdd.libreriabackend.model.Libro;
import xyz.grupojdd.libreriabackend.repository.LibroRepository;

@Service
public class LibroService implements LibroRepository{

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllInBatch(Iterable<Libro> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Libro> findAll() {
        // TODO Auto-generated method stub
        return libroRepository.findAll();
    }

    @Override
    public List<Libro> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return libroRepository.findAll(sort);
    }

    @Override
    public <S extends Libro> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Libro> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Libro> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Libro getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Libro getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Libro> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Libro> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Libro> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Libro> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Libro entity) {
        // TODO Auto-generated method stub
        libroRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Libro> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        libroRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<Libro> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Libro> S save(S entity) {
        return libroRepository.save(entity);
    }

    @Override
    public <S extends Libro> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Libro> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Libro> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Libro> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

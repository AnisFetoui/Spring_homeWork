package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.repositories.FoyerRepository;

@Service
@Slf4j
@AllArgsConstructor
public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;
}
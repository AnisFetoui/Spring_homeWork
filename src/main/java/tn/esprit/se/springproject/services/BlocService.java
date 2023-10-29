package tn.esprit.se.springproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.se.springproject.repositories.BlocRepository;

@Service
@Slf4j
@AllArgsConstructor

public class BlocService implements IBlocService{
    BlocRepository blocRepository;
}
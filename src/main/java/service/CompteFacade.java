/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import ma.zsmart.bean.Compte;

/**
 *
 * @author pc&
 */
public class CompteFacade {

    public int debiter(List<Compte> comptes, Compte compte, Double montant) {
        if (compte.getSolde() < montant) {
            return -1;
        } else {
            compte.setSolde(compte.getSolde() - montant);
            return 1;
        }
    }

    public Compte find(List<Compte> comptes, Compte compte) {
        return comptes.stream().filter(x -> x.equals(compte)).findFirst().orElse(null);
    }

}

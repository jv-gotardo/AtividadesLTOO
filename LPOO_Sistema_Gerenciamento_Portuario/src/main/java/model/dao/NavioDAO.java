/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Navio;

/**
 *
 * @author jvito
 */
public class NavioDAO extends PersistenciaJPA {
    
    public List<Navio> listarTodos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Navio> query = em.createQuery(
                    "SELECT n FROM Navio n", Navio.class
            );
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Navio buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Navio.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Navio buscarPorIMO(String imo) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Navio> query = em.createQuery(
                "SELECT n FROM Navio n WHERE n.imo = :imo", Navio.class
            );
            query.setParameter("imo", imo);
            List<Navio> lista = query.getResultList();
            return lista.isEmpty() ? null : lista.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Navio> listarPorBandeira(String bandeira) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Navio> query = em.createQuery(
                "SELECT n FROM Navio n WHERE n.bandeira = :bandeira", Navio.class
            );
            query.setParameter("bandeira", bandeira);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Navio> listarPorTonelagemMinima(double min) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Navio> query = em.createQuery(
                "SELECT n FROM Navio n WHERE n.tonelagem >= :min",
                Navio.class
            );
            query.setParameter("min", min);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Navio> listarPorComprimentoMax(double max) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Navio> query = em.createQuery(
                "SELECT n FROM Navio n WHERE n.comprimento <= :max",
                Navio.class
            );
            query.setParameter("max", max);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Berco;

/**
 *
 * @author jvito
 */
public class BercoDAO extends PersistenciaJPA {
    public List<Berco> listarTodos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Berco> query = em.createQuery(
                    "SELECT b FROM Berco b", Berco.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Berco buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Berco.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Berco> listarOcupados() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Berco> query = em.createQuery(
                    "SELECT b FROM Berco b WHERE b.ocupado = true",
                    Berco.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Berco> listarPorTipoOperacao(String tipo) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Berco> query = em.createQuery(
                    "SELECT b FROM Berco b WHERE b.tipoOperacao = :tipo",
                    Berco.class);
            query.setParameter("tipo", tipo);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

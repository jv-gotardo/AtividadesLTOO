/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Carga;

/**
 *
 * @author jvito
 */
public class CargaDAO extends PersistenciaJPA {
    
    public List<Carga> listarTodas() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Carga> query = em.createQuery(
                    "SELECT c FROM Carga c", Carga.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Carga buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carga.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Carga> listarPorTipo(String tipo) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Carga> query = em.createQuery(
                    "SELECT c FROM Carga c WHERE c.tipo = :tipo", Carga.class);
            query.setParameter("tipo", tipo);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Carga> listarPerigosas() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Carga> query = em.createQuery(
                    "SELECT c FROM Carga c WHERE c.perigosa = true", Carga.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Carga> listarPorPesoMinimo(double pesoMinimo) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Carga> query = em.createQuery(
                    "SELECT c FROM Carga c WHERE c.peso >= :pesoMinimo", Carga.class);
            query.setParameter("pesoMinimo", pesoMinimo);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}

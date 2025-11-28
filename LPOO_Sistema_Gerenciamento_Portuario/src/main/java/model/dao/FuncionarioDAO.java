/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Funcionario;
/**
 *
 * @author jvito
 */
public class FuncionarioDAO extends PersistenciaJPA {
    
    public List<Funcionario> listarTodos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Funcionario> query = em.createQuery(
                    "SELECT f FROM Funcionario f", Funcionario.class
            );
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Funcionario buscarPorId(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Funcionario.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Funcionario> listarPorCargo(String cargo) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Funcionario> query = em.createQuery(
                    "SELECT f FROM Funcionario f WHERE f.cargo = :cargo", 
                    Funcionario.class
            );
            query.setParameter("cargo", cargo);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Funcionario> listarPorTurno(int turno) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Funcionario> query = em.createQuery(
                    "SELECT f FROM Funcionario f WHERE f.turno = :turno",
                    Funcionario.class
            );
            query.setParameter("turno", turno);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Funcionario> listarSalarioMinimo(double minimo) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Funcionario> query = em.createQuery(
                    "SELECT f FROM Funcionario f WHERE f.salario >= :minimo",
                    Funcionario.class
            );
            query.setParameter("minimo", minimo);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

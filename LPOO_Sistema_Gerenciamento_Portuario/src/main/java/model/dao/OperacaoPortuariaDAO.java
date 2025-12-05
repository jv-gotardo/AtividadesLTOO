/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.OperacaoPortuaria;
import model.Navio;
import model.Carga;
import model.Berco;
import model.Funcionario;

/**
 *
 * @author jvito
 */
public class OperacaoPortuariaDAO extends PersistenciaJPA {
    
        public List<OperacaoPortuaria> listarTodas() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<OperacaoPortuaria> query = em.createQuery(
                "SELECT o FROM OperacaoPortuaria o",
                OperacaoPortuaria.class
            );
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
        
    public Optional<OperacaoPortuaria> buscarPorId(Long id) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<OperacaoPortuaria> query = em.createQuery(
                    "SELECT o FROM OperacaoPortuaria o WHERE o.id = :id", OperacaoPortuaria.class);
            query.setParameter("id", id);
            return query.getResultList().stream().findFirst();
        } finally {
            em.close();
        }
    }

    public List<OperacaoPortuaria> listarPorNavio(Navio navio) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<OperacaoPortuaria> query = em.createQuery(
                "SELECT o FROM OperacaoPortuaria o WHERE o.navio = :navio",
                OperacaoPortuaria.class
            );
            query.setParameter("navio", navio);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<OperacaoPortuaria> listarPorBerco(Berco berco) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<OperacaoPortuaria> query = em.createQuery(
                "SELECT o FROM OperacaoPortuaria o WHERE o.berco = :berco",
                OperacaoPortuaria.class
            );
            query.setParameter("berco", berco);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<OperacaoPortuaria> listarPorCarga(Carga carga) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<OperacaoPortuaria> query = em.createQuery(
                "SELECT o FROM OperacaoPortuaria o WHERE o.carga = :carga",
                OperacaoPortuaria.class
            );
            query.setParameter("carga", carga);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<OperacaoPortuaria> listarPorFuncionario(Funcionario funcionario) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<OperacaoPortuaria> query = em.createQuery(
                "SELECT o FROM OperacaoPortuaria o WHERE o.funcionario = :funcionario",
                OperacaoPortuaria.class
            );
            query.setParameter("funcionario", funcionario);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<OperacaoPortuaria> listarPorTipo(String tipo) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<OperacaoPortuaria> query = em.createQuery(
                "SELECT o FROM OperacaoPortuaria o WHERE o.tipo = :tipo",
                OperacaoPortuaria.class
            );
            query.setParameter("tipo", tipo);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<OperacaoPortuaria> listarPorIntervaloDatas(LocalDateTime inicio, LocalDateTime fim) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<OperacaoPortuaria> query = em.createQuery(
                "SELECT o FROM OperacaoPortuaria o WHERE o.dataHora BETWEEN :inicio AND :fim",
                OperacaoPortuaria.class
            );
            query.setParameter("inicio", inicio);
            query.setParameter("fim", fim);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}

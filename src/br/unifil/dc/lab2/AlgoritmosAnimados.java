package br.unifil.dc.lab2;

import java.util.List;
import java.util.ListIterator;

/**
 * Write a description of class AlgoritmosAnimados here.
 * 
 * @author Maria Isabelly Santos e Pedro Rocha
 * @version 26/04/2020
 */
public class AlgoritmosAnimados
{
    public static Gravador listaEstatica(List<Integer> valores) {
        Gravador anim = new Gravador();
        anim.gravarLista(valores, "Valores da lista imutável");
        return anim;
    }

    public static Gravador pesquisaSequencial(List<Integer> valores, int chave) {
        Gravador anim = new Gravador();
        anim.gravarLista(valores, "Inicio de pesquisa sequencial");
        
        int i = 0;
        anim.gravarIndiceDestacado(valores, i, "Pesquisa sequencial");
        while (i < valores.size() && valores.get(i) != chave) {
            i++;
            anim.gravarIndiceDestacado(valores, i, "Pesquisa sequencial");
        }
        
        if (i < valores.size()) {
            anim.gravarIndiceDestacado(valores, i, "Chave encontrada");
        } else {
            anim.gravarLista(valores, "Chave não encontrada");
        }
        
        return anim;
    }
    
    
    public static Gravador classificarPorBolha(List<Integer> valores) {
        //Gravador anim = new Gravador();
        //anim.gravarLista(valores, "Disposição inicial");
        
        throw new RuntimeException("Funcionalidade ainda não implementada pelo aluno");
        
        //anim.gravarLista(valores, "Disposição final");
        //return anim;
    }
}
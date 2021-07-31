
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Modelo {
    private String nome_produto;
    private double preco_custo;
    private double preco_venda;
    private double margem_lucro;
    private double margem_lucro_p;
    
    Scanner x = new Scanner (System.in);
    Scanner y = new Scanner (System.in);
    
    public void calcularMargemLucro(){
        margem_lucro = preco_custo - preco_venda;
    }
    
    public double getMargemLucroPorcent(){
        margem_lucro_p = (margem_lucro/preco_venda)*100;
        return margem_lucro_p;
    }
    
    public void setPrecoVenda (double pv){
        preco_venda = pv;
    }
    
    public void setPrecoCusto (double pc){
        preco_custo = pc;
    }
    
    public void setNomeProduto (String p){
        nome_produto = p;
    }
    
    public String getNomeProduto(){
        return nome_produto;
    }
    
    public double getPrecoVenda(){
        return preco_venda;
    }
    
    public double getMargemLucro(){
        return margem_lucro;
    }
}

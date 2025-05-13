package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    
    public List<Produto> listarTodos() {
        List<Produto> lista = new ArrayList<>();

        String sql = "SELECT * FROM produto";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setDescricao(rs.getString("descricao"));
                p.setQuantidade(rs.getInt("quantidade"));
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }

        return lista;
    }
    
    public List<Produto> buscarTodosPorNome(String nomeBusca) {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto WHERE LOWER(nome) LIKE ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nomeBusca.toLowerCase() + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getInt("quantidade"),
                    rs.getString("tipo")
                );
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar produtos por nome: " + e.getMessage());
        }

        return lista;
    }
    
    public void excluir(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }
    
    public Produto buscarPorNome(String nome) {
        Produto p = null;
        String sql = "SELECT * FROM produto WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                p = new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getInt("quantidade"),
                    rs.getString("tipo")
                );
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar produto: " + e.getMessage());
        }

        return p;
    }
    
    public static void inserir(Produto p) {
        try (Connection conn = Conexao.conectar()) {
            String sql = "INSERT INTO produto (nome, descricao, quantidade, tipo) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setInt(3, p.getQuantidade());
            stmt.setString(4, p.getTipo());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir: " + e);
        }
    }

    public static ArrayList<Produto> listar() {
        ArrayList<Produto> lista = new ArrayList<>();
        try (Connection conn = Conexao.conectar()) {
            String sql = "SELECT * FROM produto";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getInt("quantidade"),
                    rs.getString("tipo")
                );
                lista.add(p);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar: " + e);
        }
        return lista;
    }

    public static void excluirPorNome(String nome) {
        try (Connection conn = Conexao.conectar()) {
            String sql = "DELETE FROM produto WHERE nome = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir: " + e);
        }
    }

    public static void atualizarQuantidade(String nome, int novaQuantidade) {
        try (Connection conn = Conexao.conectar()) {
            String sql = "UPDATE produto SET quantidade = ? WHERE nome = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, novaQuantidade);
            stmt.setString(2, nome);
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar: " + e);
        }
    }
}

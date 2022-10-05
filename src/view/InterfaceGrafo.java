package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import modelo.*;

public class InterfaceGrafo extends javax.swing.JFrame {

    Dijkstra d = new Dijkstra();
    Grafo g = new Grafo();
    List<Vertice> vertices;
    List<Vertice> MenorCaminho = new ArrayList<>();
    Vertice origem;
    Vertice destino;

    public InterfaceGrafo() {
        initComponents();

        List<Vertice> vertices = new ArrayList<>();
        Dijkstra d = new Dijkstra();

        //CRIANDO TODOS VERTICES
        Vertice nortemuralha = new Vertice(" Norte da Muralha");
        Vertice amuralha = new Vertice(" A muralha");
        Vertice winterfell = new Vertice(" Winterfell");
        Vertice ilhasdeferro = new Vertice(" Ilhas de ferro");
        Vertice asgemeas = new Vertice(" As gêmeas");
        Vertice ovale = new Vertice(" O vale");
        Vertice portoreal = new Vertice(" Porto real");
        Vertice montechifre = new Vertice(" Monte chifre");
        Vertice dorne = new Vertice(" Dorne");
        Vertice braavos = new Vertice(" Braavos");
        Vertice mereen = new Vertice(" Mereen");
        Vertice vaesdothrak = new Vertice(" Vaes Dothrak");


        // CRIANDO TODAS ARESTAS
        Aresta nortemuralha_amuralha = new Aresta(nortemuralha, amuralha,44 );
        Aresta amuralha_nortemuralha = new Aresta(amuralha, nortemuralha, 44);
        Aresta nortemuralha_winterfell = new Aresta(nortemuralha, winterfell, 86);
        Aresta winterfell_nortemuralha = new Aresta(winterfell, nortemuralha, 86);
        Aresta nortemuralha_ilhasdeferro = new Aresta(nortemuralha, ilhasdeferro, 100);
        Aresta ilhasdeferro_nortemuralha = new Aresta(ilhasdeferro, nortemuralha, 100);
        Aresta ilhasdeferro_montechifre = new Aresta(ilhasdeferro, montechifre, 100);
        Aresta montechifre_ilhasdeferro = new Aresta(montechifre, ilhasdeferro, 100);
        Aresta amuralha_winterfell = new Aresta(amuralha, winterfell, 42);
        Aresta winterfell_amuralha = new Aresta(winterfell, amuralha, 42);
        Aresta amuralha_asgemeas = new Aresta(amuralha, asgemeas, 60);
        Aresta asgemeas_amuralha = new Aresta(asgemeas, amuralha, 60);
        Aresta amuralha_braavos = new Aresta(amuralha, braavos, 100);
        Aresta braavos_amuralha = new Aresta(braavos, amuralha, 100);
        Aresta winterfell_asgemeas = new Aresta(winterfell, asgemeas, 50);
        Aresta asgemeas_winterfell = new Aresta(asgemeas, winterfell, 50);
        Aresta winterfell_ovale = new Aresta(winterfell, ovale, 60);
        Aresta ovale_winterfell = new Aresta(ovale, winterfell, 60);
        Aresta winterfell_portoreal = new Aresta(winterfell, portoreal, 90);
        Aresta portoreal_winterfell = new Aresta(portoreal, winterfell, 90);
        Aresta winterfell_montechifre = new Aresta(winterfell, montechifre, 120);
        Aresta montechifre_winterfell = new Aresta(montechifre, winterfell, 120);
        Aresta asgemeas_ovale = new Aresta(asgemeas, ovale, 40);
        Aresta ovale_asgemeas = new Aresta(ovale, asgemeas, 40);
        Aresta asgemeas_portoreal = new Aresta(asgemeas, portoreal, 50);
        Aresta portoreal_asgemeas = new Aresta(portoreal, asgemeas, 50);
        Aresta ovale_portoreal = new Aresta(ovale, portoreal, 30);
        Aresta portoreal_ovale = new Aresta(portoreal, ovale, 30);
        Aresta ovale_montechifre = new Aresta(ovale, montechifre, 105);
        Aresta montechifre_ovale = new Aresta(montechifre, ovale, 105);
        Aresta ovale_dorne = new Aresta(ovale, dorne, 125);
        Aresta dorne_ovale = new Aresta(dorne, ovale, 125);
        Aresta ovale_braavos = new Aresta(ovale, braavos, 70);
        Aresta braavos_ovale = new Aresta(braavos, ovale, 70);
        Aresta ovale_mereen = new Aresta(ovale, mereen, 200);
        Aresta mereen_ovale = new Aresta(mereen, ovale, 200);
        Aresta ovale_vaesdothrak = new Aresta(ovale, vaesdothrak, 230);
        Aresta vaesdothrak_ovale = new Aresta(vaesdothrak, ovale, 230);
        Aresta portoreal_montechifre = new Aresta(portoreal, montechifre, 75);
        Aresta montechifre_portoreal = new Aresta(montechifre, portoreal, 75);
        Aresta portoreal_dorne = new Aresta(portoreal, dorne, 85);
        Aresta dorne_portoreal = new Aresta(dorne, portoreal, 85);
        Aresta montechifre_dorne = new Aresta(montechifre, dorne, 62);
        Aresta dorne_montechifre = new Aresta(dorne, montechifre,62 );
        Aresta montechifre_braavos = new Aresta(montechifre, braavos, 132);
        Aresta braavos_montechifre = new Aresta(braavos, montechifre, 132);
        Aresta montechifre_mereen = new Aresta(montechifre, mereen, 160);
        Aresta mereen_montechifre = new Aresta(mereen, montechifre, 160);
        Aresta montechifre_vaesdothrak = new Aresta(montechifre, vaesdothrak, 347);
        Aresta vaesdothrak_montechifre = new Aresta(vaesdothrak, montechifre, 347);
        Aresta dorne_braavos = new Aresta(dorne, braavos, 143);
        Aresta braavos_dorne = new Aresta(braavos, dorne, 143);
        Aresta dorne_mereen = new Aresta(dorne, mereen, 170);
        Aresta mereen_dorne = new Aresta(mereen, dorne, 170);
        Aresta dorne_vaesdothrak = new Aresta(dorne, vaesdothrak, 322);
        Aresta vaesdothrak_dorne = new Aresta(vaesdothrak, dorne, 322);
        Aresta braavos_mereen = new Aresta(braavos, mereen, 115);
        Aresta mereen_braavos = new Aresta(mereen, braavos, 115);
        Aresta braavos_vaesdothrak = new Aresta(braavos, vaesdothrak, 137);
        Aresta vaesdothrak_braavos = new Aresta(vaesdothrak, braavos, 137);
        Aresta mereen_vaesdothrak = new Aresta(mereen, vaesdothrak, 95);
        Aresta vaesdothrak_mereen = new Aresta(vaesdothrak, mereen, 95);


        //ADICIONANDO AS ARESTAS DE CADA VERTICE
        nortemuralha.getArestas().add(nortemuralha_ilhasdeferro);
        nortemuralha.getArestas().add(nortemuralha_amuralha);
        nortemuralha.getArestas().add(nortemuralha_winterfell);


        amuralha.getArestas().add(amuralha_nortemuralha);
        amuralha.getArestas().add(amuralha_winterfell);
        amuralha.getArestas().add(amuralha_asgemeas);
        amuralha.getArestas().add(amuralha_braavos);

        winterfell.getArestas().add(winterfell_nortemuralha);
        winterfell.getArestas().add(winterfell_amuralha);
        winterfell.getArestas().add(winterfell_asgemeas);
        winterfell.getArestas().add(winterfell_ovale);
        winterfell.getArestas().add(winterfell_portoreal);
        winterfell.getArestas().add(winterfell_montechifre);

        ilhasdeferro.getArestas().add(ilhasdeferro_nortemuralha);
        ilhasdeferro.getArestas().add(ilhasdeferro_montechifre);

        asgemeas.getArestas().add(asgemeas_amuralha);
        asgemeas.getArestas().add(asgemeas_winterfell);
        asgemeas.getArestas().add(asgemeas_ovale);
        asgemeas.getArestas().add(asgemeas_portoreal);

        ovale.getArestas().add(ovale_asgemeas);
        ovale.getArestas().add(ovale_winterfell);
        ovale.getArestas().add(ovale_portoreal);
        ovale.getArestas().add(ovale_montechifre);
        ovale.getArestas().add(ovale_dorne);
        ovale.getArestas().add(ovale_braavos);
        ovale.getArestas().add(ovale_mereen);
        ovale.getArestas().add(ovale_vaesdothrak);

        portoreal.getArestas().add(portoreal_asgemeas);
        portoreal.getArestas().add(portoreal_winterfell);
        portoreal.getArestas().add(portoreal_ovale);
        portoreal.getArestas().add(portoreal_montechifre);
        portoreal.getArestas().add(portoreal_dorne);

        montechifre.getArestas().add(montechifre_portoreal);
        montechifre.getArestas().add(montechifre_winterfell);
        montechifre.getArestas().add(montechifre_ovale);
        montechifre.getArestas().add(montechifre_dorne);
        montechifre.getArestas().add(montechifre_braavos);
        montechifre.getArestas().add(montechifre_mereen);
        montechifre.getArestas().add(montechifre_vaesdothrak);
        montechifre.getArestas().add(montechifre_ilhasdeferro);

        dorne.getArestas().add(dorne_portoreal);
        dorne.getArestas().add(dorne_ovale);
        dorne.getArestas().add(dorne_montechifre);
        dorne.getArestas().add(dorne_braavos);
        dorne.getArestas().add(dorne_mereen);
        dorne.getArestas().add(dorne_vaesdothrak);

        braavos.getArestas().add(braavos_dorne);
        braavos.getArestas().add(braavos_ovale);
        braavos.getArestas().add(braavos_montechifre);
        braavos.getArestas().add(braavos_mereen);
        braavos.getArestas().add(braavos_vaesdothrak);
        braavos.getArestas().add(braavos_amuralha);

        mereen.getArestas().add(mereen_dorne);
        mereen.getArestas().add(mereen_ovale);
        mereen.getArestas().add(mereen_montechifre);
        mereen.getArestas().add(mereen_braavos);
        mereen.getArestas().add(mereen_vaesdothrak);

        vaesdothrak.getArestas().add(vaesdothrak_dorne);
        vaesdothrak.getArestas().add(vaesdothrak_ovale);
        vaesdothrak.getArestas().add(vaesdothrak_montechifre);
        vaesdothrak.getArestas().add(vaesdothrak_braavos);
        vaesdothrak.getArestas().add(vaesdothrak_mereen);


        //ADICIONANDO TODOS VERTICES A UMA LISTA.
        vertices.add(nortemuralha);
        vertices.add(amuralha);
        vertices.add(winterfell);
        vertices.add(ilhasdeferro);
        vertices.add(asgemeas);
        vertices.add(ovale);
        vertices.add(portoreal);
        vertices.add(montechifre);
        vertices.add(dorne);
        vertices.add(braavos);
        vertices.add(mereen);
        vertices.add(vaesdothrak);

        g.setVertices(vertices);
        g.getVertices().sort(new OrdenaNomeVertice());
        for (int i = 0; i < g.getVertices().size(); i++) {
            cbo.addItem(g.getVertices().get(i).getDescricao());
            cbd.addItem(g.getVertices().get(i).getDescricao());

        }
        bpassos.setEnabled(false);
    }

    private void initComponents() {

        labelOrigem = new javax.swing.JLabel();
        labelDestino = new javax.swing.JLabel();
        cbd = new javax.swing.JComboBox<>();
        bcr = new javax.swing.JButton();
        cbo = new javax.swing.JComboBox<>();
        bSair = new javax.swing.JButton();
        labelDis = new javax.swing.JLabel();
        texDistancia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoResult = new javax.swing.JTextArea();
        labelResul = new javax.swing.JLabel();
        limage = new javax.swing.JLabel();
        bpassos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelOrigem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelOrigem.setText("Origem");

        labelDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDestino.setText("Destino");

        bcr.setBackground(new java.awt.Color(0, 153, 51));
        bcr.setForeground(new java.awt.Color(255, 255, 255));
        bcr.setText("Calcular Rota");
        bcr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcrActionPerformed(evt);
            }
        });

        cbo.setToolTipText("");

        bSair.setBackground(new java.awt.Color(255, 51, 51));
        bSair.setForeground(new java.awt.Color(255, 255, 255));
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        labelDis.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDis.setText("Ditância Total:");

        texDistancia.setEditable(false);
        texDistancia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        campoResult.setEditable(false);
        campoResult.setColumns(20);
        campoResult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campoResult.setRows(5);
        jScrollPane1.setViewportView(campoResult);

        labelResul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelResul.setText("Resultado");

        limage.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("graphs.png"))));
        limage.setText(" ");

        bpassos.setBackground(new java.awt.Color(0, 102, 255));
        bpassos.setForeground(new java.awt.Color(255, 255, 255));
        bpassos.setText("Ver Algoritmo Passo a Passo");
        bpassos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpassosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bSair)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(limage, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelOrigem)
                                .addGap(18, 18, 18)
                                .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(labelDestino)
                                .addGap(29, 29, 29)
                                .addComponent(cbd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelResul)
                                .addGap(78, 78, 78)
                                .addComponent(labelDis)
                                .addGap(18, 18, 18)
                                .addComponent(texDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bcr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bpassos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(limage, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrigem)
                    .addComponent(cbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDestino)
                    .addComponent(cbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDis, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelResul)
                        .addComponent(bpassos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texDistancia)
                        .addGap(4, 4, 4)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSair)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        System.exit(0);
    }

    private void bcrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcrActionPerformed
        origem = null;
        destino = null;
        for (int i = 0; i < g.getVertices().size(); i++) {
            g.getVertices().get(i).setVisitado(false);
            g.getVertices().get(i).setPai(null);

        }

        campoResult.setText("");
        texDistancia.setText("");

        origem = g.encontrarVertice(cbo.getModel().getElementAt(cbo.getSelectedIndex()));
        destino = g.encontrarVertice(cbd.getModel().getElementAt(cbd.getSelectedIndex()));

        MenorCaminho = d.encontrarMenorCaminhoDijkstra(g, origem, destino);

        String s = "Percurso: ";
        for (int i = 0; i < MenorCaminho.size(); i++) {
            s += (MenorCaminho.get(i).getDescricao() + " >> ");

        }
        campoResult.setText("\n"+s);
        texDistancia.setText(MenorCaminho.get(MenorCaminho.size() - 1).getDistancia() + " Km");
        MenorCaminho.clear();
        bpassos.setEnabled(true);
    }

    private void bpassosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpassosActionPerformed
        Passos dialog = new Passos(new javax.swing.JFrame(), true);
        dialog.getTextPassos().setText(d.saida);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);

    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafo().setVisible(true);
            }
        });
    }

    private javax.swing.JButton bSair;
    private javax.swing.JButton bcr;
    private javax.swing.JButton bpassos;
    private javax.swing.JTextArea campoResult;
    private javax.swing.JComboBox<String> cbd;
    private javax.swing.JComboBox<String> cbo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDestino;
    private javax.swing.JLabel labelDis;
    private javax.swing.JLabel labelOrigem;
    private javax.swing.JLabel labelResul;
    private javax.swing.JLabel limage;
    private javax.swing.JTextField texDistancia;
}

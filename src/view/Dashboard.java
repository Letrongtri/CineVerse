/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import model.Revenue;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartPanel;
import DatabaseConnection.DashboardDAO;
import java.awt.Color;
import model.View;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
/**
 *
 * @author Tieu Bang
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        showRevenueChart();
        showViewChart();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1268, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBackground(new java.awt.Color(204, 204, 204, 123));
        jPanel3.setPreferredSize(new java.awt.Dimension(1268, 300));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));
    }// </editor-fold>//GEN-END:initComponents


    public void refresh(){
        jPanel2.removeAll();
        jPanel3.removeAll();
        
        showRevenueChart();
        showViewChart();
        
        jPanel2.revalidate();
        jPanel2.repaint();
        jPanel3.revalidate();
        jPanel3.repaint();
    }             
    public void showRevenueChart(){                        
        List<Revenue> revenues = DashboardDAO.getRevenueData(); 
        
        if (revenues != null){
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (Revenue revenue : revenues) { 
                dataset.addValue(revenue.getRevenue(), "USD", revenue.getDate()); 
            }
            
            JFreeChart chart = ChartFactory.createBarChart("Sales Statistics", "Date", "Quantity", dataset);  
            ChartPanel chartPanel = new ChartPanel(chart);         
            chartPanel.setPreferredSize(new Dimension(800, 300)); 
            
            //Set color for rows in chart
            CategoryPlot plot = chart.getCategoryPlot();
            BarRenderer renderer = (BarRenderer) plot.getRenderer();
            renderer.setSeriesPaint(0, new Color(178, 34, 34));
            
            //Set color for chart's background
            plot.setBackgroundPaint(new Color(205, 201, 201, 123)); // Đặt màu nền
            plot.setRangeGridlinePaint(Color.BLACK);          // Đặt màu cho đường lưới ngang
            plot.setDomainGridlinePaint(Color.LIGHT_GRAY);    // Đặt màu cho đường lưới dọc

            CategoryAxis domainAxis = plot.getDomainAxis();
            domainAxis.setTickLabelPaint(Color.BLACK);    // Màu chữ trên trục ngang
            domainAxis.setLabelPaint(Color.BLACK);           // Màu tên trục ngang

            ValueAxis rangeAxis = plot.getRangeAxis();
            rangeAxis.setTickLabelPaint(Color.BLACK);    // Màu chữ trên trục dọc
            rangeAxis.setLabelPaint(Color.BLACK);           // Màu tên trục dọc
            
            
            jPanel2.setLayout(new BorderLayout());     
            jPanel2.add(chartPanel);                   
        }
        
    }
    public void showViewChart(){                        
        List<View> views = DashboardDAO.getViewData();
        
        if (views != null){
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (View view : views) { 
                dataset.addValue(view.getTotalViews(), "Movie", view.getMovieTitle()); 
            }
            
            JFreeChart chart = ChartFactory.createBarChart("View By Movie", "Movie Name", "Total View", dataset);  
            ChartPanel chartPanel = new ChartPanel(chart);          
            chartPanel.setPreferredSize(new Dimension(800, 300));  
            
             //Set color for rows in chart
            CategoryPlot plot = chart.getCategoryPlot();
            BarRenderer renderer = (BarRenderer) plot.getRenderer();
            renderer.setSeriesPaint(0, new Color(178, 34, 34));
            
            //Set color for chart's background
            plot.setBackgroundPaint(new Color(205, 201, 201, 123)); // Đặt màu nền
            plot.setRangeGridlinePaint(Color.BLACK);          // Đặt màu cho đường lưới ngang
            plot.setDomainGridlinePaint(Color.LIGHT_GRAY);    // Đặt màu cho đường lưới dọc

            CategoryAxis domainAxis = plot.getDomainAxis();
            domainAxis.setTickLabelPaint(Color.BLACK);    // Màu chữ trên trục ngang
            domainAxis.setLabelPaint(Color.BLACK);           // Màu tên trục ngang

            ValueAxis rangeAxis = plot.getRangeAxis();
            rangeAxis.setTickLabelPaint(Color.BLACK);    // Màu chữ trên trục dọc
            rangeAxis.setLabelPaint(Color.BLACK);           // Màu tên trục dọc
            
            jPanel3.setLayout(new BorderLayout());      
            jPanel3.add(chartPanel);                    
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}


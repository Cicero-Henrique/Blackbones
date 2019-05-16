package blackbones;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Estatisticas;

public class BlackBones 
{
    public static void criarGrafico()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.1, "Máximo", "Hora 1");
        dataset.addValue(20.1, "Máximo", "Hora 2");
        dataset.addValue(50.1, "Máximo", "Hora 3");
        dataset.addValue(40.1, "Máximo", "Hora 4");
        dataset.addValue(70.1, "Máximo", "Hora 5");
        dataset.addValue(90.1, "Máximo", "Hora 6");

        JFreeChart criaGrafico = ChartFactory.createLineChart("Grafico", "Hora", "Valor", 
                dataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = criaGrafico.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setBaseShapesVisible(true);
        renderer.setSeriesPaint(0, Color.BLUE);
        DecimalFormat format = new DecimalFormat("#0.##");
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", format));
        renderer.setBaseItemLabelsVisible(true);
       
       
       try 
       {
           OutputStream png = new FileOutputStream("Grafico_Normal.png");
           ChartUtilities.writeChartAsPNG(png, criaGrafico, 500, 400);
           png.close();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BlackBones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BlackBones.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       
    }
    
    public static void main(String[] args) 
    {
        criarGrafico();
        Estatisticas e = new Estatisticas();
        e.setVisible(true);
    }
}
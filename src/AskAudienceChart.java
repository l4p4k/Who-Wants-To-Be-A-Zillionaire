import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;



public class AskAudienceChart extends JFrame {

 private static final long serialVersionUID = 1L;

 public AskAudienceChart(String applicationTitle, String chartTitle, int a, int b, int c, int d) {
       super(applicationTitle);
       DefaultPieDataset result = new DefaultPieDataset();
       result.setValue("A", a);
       result.setValue("B", b);
       result.setValue("C", c);
       result.setValue("D", d);
       PieDataset dataset = result;
       JFreeChart chart = createChart(dataset, chartTitle);
       ChartPanel chartPanel = new ChartPanel(chart);
       chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
       setContentPane(chartPanel);
   }
   
   private JFreeChart createChart(PieDataset dataset, String title) {
       
       JFreeChart chart = ChartFactory.createPieChart3D(title,          // chart title
           dataset,                // data
           true,                   // include legend
           true,
           false);

       PiePlot3D plot = (PiePlot3D) chart.getPlot();
       plot.setStartAngle(290);
       plot.setDirection(Rotation.CLOCKWISE);
       plot.setForegroundAlpha(0.7f);
       return chart;
       
   }
} 
DefaultCategoryDataset dataset = new DefaultCategoryDataset();
dataset.addValue(80, "Category 1", "2019");
dataset.addValue(100, "Category 1", "2020");
dataset.addValue(120, "Category 1", "2021");

JFreeChart barChart = ChartFactory.createBarChart(
        "Category Overview", "Year", "Value", dataset,
        PlotOrientation.VERTICAL, true, true, false);

ChartPanel chartPanel = new ChartPanel(barChart);
JFrame frame = new JFrame();
frame.add(chartPanel);
frame.pack();
frame.setVisible(true);

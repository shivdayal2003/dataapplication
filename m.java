LineChart<String, Number> lineChart = new LineChart<>(new CategoryAxis(), new NumberAxis());
lineChart.setTitle("Data Visualization");

XYChart.Series<String, Number> series = new XYChart.Series<>();
series.setName("Data Series");

// Add data points to the series
series.getData().add(new XYChart.Data<>("Jan", 200));
series.getData().add(new XYChart.Data<>("Feb", 450));

lineChart.getData().add(series);

for (XYChart.Data<String, Number> dataPoint : series.getData()) {
    Tooltip tooltip = new Tooltip(dataPoint.getYValue().toString());
    Tooltip.install(dataPoint.getNode(), tooltip);
}

lineChart.setOnScroll(event -> {
    double zoomFactor = 1.1;
    if (event.getDeltaY() < 0) {
        zoomFactor = 1 / zoomFactor;
    }
    lineChart.setScaleX(lineChart.getScaleX() * zoomFactor);
    lineChart.setScaleY(lineChart.getScaleY() * zoomFactor);
});

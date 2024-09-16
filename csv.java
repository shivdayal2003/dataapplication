BufferedReader br = new BufferedReader(new FileReader("data.csv"));
String line;
while ((line = br.readLine()) != null) {
    String[] values = line.split(",");
    // Process data (e.g., add to chart series)
}

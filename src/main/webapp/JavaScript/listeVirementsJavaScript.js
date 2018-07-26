 google.charts.load('current', {'packages':['corechart']});
 google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Task', 'Montant total des virements par semaines'],
          ['Semaine1-130000 e', 130000],
          ['Semaine2-150000 e', 150000],
          ['Semaine3-170000 e', 170000],
          ['Semaine4-155000 e', 155000]
        ]);

        var options = {
          title: 'Virements du dernier mois par semaines'
        };

        var chart = new google.visualization.PieChart(document.getElementById('histogrammeVirements'));

        chart.draw(data, options);
      }

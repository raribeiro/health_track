const labelsPeso = [
    'January',
    'February',
    'March',
    'April',
    'May',
    'June',
  ];


  const dataPeso = {
    labels: labelsPeso,
    datasets: [{
      label: 'peso',
      backgroundColor: 'rgb(255, 99, 132)',
      borderColor: 'rgb(255, 99, 132)',
      data: [87, 78, 90],
      yAxisID: 'y',
      borderColor: "#084de0",
      backgroundColor: "#084de0"
    }, {
        label: 'meta',
        backgroundColor: 'rgb(255, 99, 132)',
        borderColor: 'rgb(255, 99, 132)',
        data: [72, 80, 83],
        yAxisID: 'y1'
      }]
  };

  const configPeso = {
    type: 'line',
    data: dataPeso,
    options: {
        plugins: {
            title: {
                display: true,
                text: "Oscilação nos últimos 12 meses",
                position: "top"
            },
            legend:{
                display: false
            }
        },
        stacked: false,
        scales: {
            y: {
              type: 'linear',
              display: true,
              position: 'left',
            },
            y1: {
              type: 'linear',
              display: true,
              position: 'right',

              // grid line settings
              grid: {
                drawOnChartArea: false, // only want the grid lines for one axis to show up
              },
            },
          }
    }
  };

  const myChart = new Chart(
    document.getElementById('myChart'),
    configPeso
  );


  /* Chat Atividades */

  const labelsAtv = [
    'January',
    'February',
    'March',
    'April',
    'May',
    'June',
  ];

  const dataAtv = {
    labels: labelsAtv,
    datasets: [{
      label: 'atividades',
      backgroundColor: 'rgb(255, 99, 132)',
      borderColor: 'rgb(255, 99, 132)',
      data: [0, 10, 5],
    }]
  };

  const configAtv = {
    type: 'line',
    data: dataAtv,
    options: {
        plugins: {
            title: {
                display: true,
                text: "Oscilação nos últimos 12 meses",
                position: "top"
            },
            legend:{
                display: false
            }
        }
    }
  };

  const chartAtv = new Chart(
    document.getElementById('ativiDades'),
    configAtv
  );

  /* Gráfico de horas de sono */

  const labelsHs = [
    'January',
    'February',
    'March',
    'April',
    'May',
    'June',
  ];

  const dataHs = {
    labels: labelsHs,
    datasets: [{
      label: 'horas',
      backgroundColor: 'rgb(255, 99, 132)',
      borderColor: 'rgb(255, 99, 132)',
      data: [0, 2, 5],
    }]
  };

  const configHs = {
    type: 'line',
    data: dataHs,
    options: {
        plugins: {
            title: {
                display: true,
                text: "Oscilação nos últimos 12 meses",
                position: "top"
            },
            legend:{
                display: false
            }
        }
    }
  };

  const chartHs = new Chart(
    document.getElementById('horaSono'),
    configHs
  );

  /* Gráfico de pressão */

  const labelsPs = [
    '01',
    '02',
    '03'
  ];

  const dataPs = {
    labels: labelsPs,
    datasets: [{
      label: 'pressão média',
      backgroundColor: 'rgb(255, 99, 132)',
      borderColor: 'rgb(255, 99, 132)',
      data: [12.8, 13.6, 18.8],
    }]
  };

  const configPs = {
    type: 'line',
    data: dataPs,
    options: {
        plugins: {
            title: {
                display: true,
                text: "Oscilação nos últimos 12 meses",
                position: "top"
            },
            legend:{
                display: false
            }
        }
    }
  };

  const chartPs = new Chart(
    document.getElementById('PsChart'),
    configPs
  );
javascript
document.getElementById('appointment-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const petId = document.getElementById('petId').value;
    const serviceType = document.getElementById('serviceType').value;
    const appointmentTime = document.getElementById('appointmentTime').value;

    fetch('/api/appointments', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ petId, serviceType, appointmentTime })
    }).then(response => response.json())
      .then(data => {
          alert('预约成功！');
          console.log('Appointment created:', data);
      }).catch(error => {
          alert('预约失败！');
          console.error('Error:', error);
      });
});

document.getElementById('adoption-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const petId = document.getElementById('petId').value;
    const adopterName = document.getElementById('adopterName').value;

    fetch('/api/adoptions', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ petId, adopterName })
    }).then(response => response.json())
      .then(data => {
          alert('领养成功！');
          console.log('Adoption created:', data);
      }).catch(error => {
          alert('领养失败！');
          console.error('Error:', error);
      });
});
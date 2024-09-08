document.getElementById('saveButton').addEventListener('click', function() {
   
    const name = document.getElementById('name').value;
    const vehicleName = document.getElementById('vehicleName').value;
    const vehicleNumber = document.getElementById('vehicleNumber').value;
    const entryDate = document.getElementById('entryDate').value;
    const exitDate = document.getElementById('exitDate').value;

   
    const table = document.getElementById('parkingTable').getElementsByTagName('tbody')[0];
    const newRow = table.insertRow();

    
    const nameCell = newRow.insertCell(0);
    nameCell.textContent = name;

    const vehicleNameCell = newRow.insertCell(1);
    vehicleNameCell.textContent = vehicleName;

    const vehicleNumberCell = newRow.insertCell(2);
    vehicleNumberCell.textContent = vehicleNumber;

    const entryDateCell = newRow.insertCell(3);
    entryDateCell.textContent = new Date(entryDate).toLocaleString();

    const exitDateCell = newRow.insertCell(4);
    exitDateCell.textContent = new Date(exitDate).toLocaleString();

   
    document.getElementById('name').value = '';
    document.getElementById('vehicleName').value = '';
    document.getElementById('vehicleNumber').value = '';
    document.getElementById('entryDate').value = '';
    document.getElementById('exitDate').value = '';
});

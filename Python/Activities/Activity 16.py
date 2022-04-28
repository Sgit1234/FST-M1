from distutils.archive_util import make_archive
from pyexpat import model
from turtle import color


class Car():
    'This is a car class for an activity'
    def __init__(self, manufacturer, model, make, transmission, color):
        
            self.manufacturer = manufacturer
            self.model = model
            self.make = make
            self.transmission = transmission
            self.color = color
        
    def acc(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")

car1 = Car("Toyota", "Corolla", "2015", "Manual", "Silver")
car2 = Car("Maruti", "800", "2013", "Manual", "Blue")
car3 = Car("Suzuki", "Swift", "2017", "Automatic", "Gold")         

car3.acc()
car1.stop()



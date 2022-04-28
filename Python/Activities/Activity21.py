import pytest

def test_sum():

    num1=20
    num2=30
    sumvalue=num1+num2
    assert sumvalue==50

def test_diff():
    num1=50
    num2=30
    diffvalue=num1-num2
    assert diffvalue==20

def test_prd():
    num1=20
    num2=30
    prdvalue=num1*num2
    assert prdvalue==600

def test_div():
    num1=40
    num2=5
    qntvalue=num1/num2
    assert qntvalue==8
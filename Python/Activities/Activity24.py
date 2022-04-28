import pytest

@pytest.fixture
def mywallet():
    amt=0
    return amt

@pytest.mark.parametrize("earned, spent, expected",[(30,10,20),(20,2,18)])
def test_wallet(mywallet,earned,spent,expected):
    assert mywallet+earned-spent == expected
 
function Test-SoChanLe {
    param(
        [int]$SoBatDau,
        [int]$SoKetThuc
    )

    for ($i = $SoBatDau; $i -le $SoKetThuc; $i++) {
        if ($i % 2 -eq 0) {
            Write-Output "So chan: $i"
        }
        else {
            Write-Output "So le: $i"
        }
    }
}

# Goi ham voi khoang so tu 1 den 10
Test-SoChanLe -SoBatDau 1 -SoKetThuc 10

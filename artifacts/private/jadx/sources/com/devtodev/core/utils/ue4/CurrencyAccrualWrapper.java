package com.devtodev.core.utils.ue4;

import com.devtodev.core.data.consts.AccrualType;

/* JADX INFO: loaded from: classes3.dex */
public class CurrencyAccrualWrapper {
    public static AccrualType getTypeFromOrdinal(int i10) {
        if (i10 != 0 && i10 == 1) {
            return AccrualType.Purchased;
        }
        return AccrualType.Earned;
    }
}

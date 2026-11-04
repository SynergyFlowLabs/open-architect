package com.devtodev.core.utils.ue4;

import com.devtodev.core.data.consts.Gender;

/* JADX INFO: loaded from: classes3.dex */
public class GenderWrapper {
    public static Gender getGenderFromOrdinal(int i10) {
        if (i10 == 0) {
            return Gender.Unknown;
        }
        if (i10 != 1) {
            return i10 != 2 ? Gender.Unknown : Gender.Female;
        }
        return Gender.Male;
    }
}

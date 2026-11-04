package com.devtodev.analytics.internal.validator;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CurrencyValidator {

    @NotNull
    private final List<String> validCurrencies = new ArrayList();

    @NotNull
    public final List<String> getValidCurrencies() {
        return this.validCurrencies;
    }
}

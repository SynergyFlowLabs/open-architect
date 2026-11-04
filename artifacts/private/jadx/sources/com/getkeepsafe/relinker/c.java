package com.getkeepsafe.relinker;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class c extends RuntimeException {
    public c(final String library, final String[] wantedABIs, final String[] supportedABIs) {
        super("Could not find '" + library + "'. Looked for: " + Arrays.toString(wantedABIs) + ", but only found: " + Arrays.toString(supportedABIs) + ".");
    }
}

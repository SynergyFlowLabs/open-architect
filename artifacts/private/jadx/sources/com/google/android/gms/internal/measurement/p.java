package com.google.android.gms.internal.measurement;

import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface p {
    public static final p S1 = new u();
    public static final p T1 = new n();
    public static final p U1 = new h(ActionType.CONTINUE);
    public static final p V1 = new h("break");
    public static final p W1 = new h("return");
    public static final p X1 = new g(Boolean.TRUE);
    public static final p Y1 = new g(Boolean.FALSE);
    public static final p Z1 = new t("");

    p Y();

    Iterator c();

    String h();

    Boolean j();

    Double m();

    p p(String str, e5 e5Var, List list);
}

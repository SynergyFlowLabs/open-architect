package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class RequestParams extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public abstract Set<Uri> O1();

    @NonNull
    public abstract Uri T1();

    @NonNull
    public abstract ChannelIdValue b2();

    @NonNull
    public abstract String e2();

    @NonNull
    public abstract List<RegisteredKey> f2();

    @NonNull
    public abstract Integer n2();

    @NonNull
    public abstract Double p2();
}

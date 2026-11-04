package com.google.api.client.googleapis.notifications.json;

import com.google.api.client.json.d;
import com.google.api.client.util.f;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@f
public abstract class a<T> extends com.google.api.client.googleapis.notifications.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f115483b = 1;

    protected abstract d d() throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.api.client.googleapis.notifications.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final com.google.api.client.json.f b() throws IOException {
        return new com.google.api.client.json.f(d());
    }
}

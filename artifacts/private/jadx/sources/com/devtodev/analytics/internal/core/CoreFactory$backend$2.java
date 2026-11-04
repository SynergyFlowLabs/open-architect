package com.devtodev.analytics.internal.core;

import com.devtodev.analytics.internal.backend.Backend;
import com.devtodev.analytics.internal.backend.repository.BackendRepository;
import com.devtodev.analytics.internal.backend.repository.contentbuilder.ContentBuilder;
import com.devtodev.analytics.internal.backend.repository.json.JsonParser;
import com.devtodev.analytics.internal.datacompression.ZstdCompressor;
import com.devtodev.analytics.internal.network.Network;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CoreFactory$backend$2 extends l0 implements Function0<Backend> {
    public static final CoreFactory$backend$2 INSTANCE = new CoreFactory$backend$2();

    public CoreFactory$backend$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Backend invoke() {
        return new Backend(new BackendRepository(new Network(), new ContentBuilder(new ZstdCompressor()), new JsonParser()));
    }
}

package com.segment.analytics.kotlin.core;

import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public enum EventType {
    Track,
    Screen,
    Alias,
    Identify,
    Group;


    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f0<KSerializer<Object>> f266653a = g0.b(j0.PUBLICATION, a.f266660a);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ f0 a() {
            return EventType.f266653a;
        }

        @NotNull
        public final KSerializer<EventType> serializer() {
            return (KSerializer) a().getValue();
        }

        private Companion() {
        }
    }

    static final class a extends l0 implements Function0<KSerializer<Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f266660a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final KSerializer<Object> invoke() {
            return kotlinx.serialization.internal.l0.b("com.segment.analytics.kotlin.core.EventType", EventType.values(), new String[]{"track", com.segment.analytics.kotlin.android.plugins.a.f266538j3, "alias", "identify", "group"}, new Annotation[][]{null, null, null, null, null});
        }
    }
}

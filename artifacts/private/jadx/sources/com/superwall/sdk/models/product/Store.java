package com.superwall.sdk.models.product;

import com.superwall.sdk.models.product.Store;
import java.lang.annotation.Annotation;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.c0;
import kotlinx.serialization.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public enum Store {
    PLAY_STORE;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: ag.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Store._init_$_anonymous_();
        }
    });

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) Store.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final Store fromValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, "PLAY_STORE")) {
                return Store.PLAY_STORE;
            }
            throw new c0("Store must be PLAY_STORE, found: " + value);
        }

        @NotNull
        public final KSerializer<Store> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return l0.a("com.superwall.sdk.models.product.Store", values(), new String[]{"PLAY_STORE"}, new Annotation[][]{null}, null);
    }

    @NotNull
    public static a<Store> getEntries() {
        return $ENTRIES;
    }
}

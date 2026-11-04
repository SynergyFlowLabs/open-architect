package com.superwall.sdk.models.product;

import com.superwall.sdk.models.product.ProductType;
import java.lang.annotation.Annotation;
import java.util.Locale;
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
import kotlinx.serialization.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
public enum ProductType {
    PRIMARY,
    SECONDARY,
    TERTIARY;

    private static final /* synthetic */ a $ENTRIES = c.c(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: ag.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProductType._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ProductType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<ProductType> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = (0 << 0) << 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return l0.a("com.superwall.sdk.models.product.ProductType", values(), new String[]{"primary", "secondary", "tertiary"}, new Annotation[][]{null, null, null}, null);
    }

    @NotNull
    public static a<ProductType> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}

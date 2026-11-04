package com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast;

import com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.CELUnaryOp;
import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.m;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@b0
@m
@a0("CELUnaryOp")
public abstract class CELUnaryOp implements ToExprString {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CELUnaryOp._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) CELUnaryOp.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<CELUnaryOp> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    @a0("DoubleMinus")
    public static final class DoubleMinus extends CELUnaryOp {

        @NotNull
        public static final DoubleMinus INSTANCE = new DoubleMinus();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELUnaryOp.DoubleMinus._init_$_anonymous_();
            }
        });

        private DoubleMinus() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("DoubleMinus", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<DoubleMinus> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "--";
        }
    }

    @b0
    @a0("DoubleNot")
    public static final class DoubleNot extends CELUnaryOp {

        @NotNull
        public static final DoubleNot INSTANCE = new DoubleNot();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELUnaryOp.DoubleNot._init_$_anonymous_();
            }
        });

        private DoubleNot() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("DoubleNot", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<DoubleNot> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "!!";
        }
    }

    @b0
    @a0("Minus")
    public static final class Minus extends CELUnaryOp {

        @NotNull
        public static final Minus INSTANCE = new Minus();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELUnaryOp.Minus._init_$_anonymous_();
            }
        });

        private Minus() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Minus", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Minus> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "-";
        }
    }

    @b0
    @a0("Not")
    public static final class Not extends CELUnaryOp {

        @NotNull
        public static final Not INSTANCE = new Not();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: cg.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CELUnaryOp.Not._init_$_anonymous_();
            }
        });

        private Not() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("Not", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<Not> serializer() {
            return get$cachedSerializer();
        }

        @Override // com.superwall.sdk.paywall.presentation.rule_logic.cel.models.ast.ToExprString
        @NotNull
        public String toExprString() {
            return "!";
        }
    }

    public /* synthetic */ CELUnaryOp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("CELUnaryOp", j1.d(CELUnaryOp.class), new d[]{j1.d(DoubleMinus.class), j1.d(DoubleNot.class), j1.d(Minus.class), j1.d(Not.class)}, new KSerializer[]{new z1("DoubleMinus", DoubleMinus.INSTANCE, new Annotation[0]), new z1("DoubleNot", DoubleNot.INSTANCE, new Annotation[0]), new z1("Minus", Minus.INSTANCE, new Annotation[0]), new z1("Not", Not.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(CELUnaryOp cELUnaryOp, e eVar, SerialDescriptor serialDescriptor) {
    }

    private CELUnaryOp() {
    }

    public /* synthetic */ CELUnaryOp(int i10, v2 v2Var) {
    }
}

package com.planner5d.library.services;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.EditTextWithValidator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nForm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Form.kt\ncom/planner5d/library/services/Form\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n13409#2,2:81\n13409#2,2:83\n13409#2,2:85\n1#3:87\n*S KotlinDebug\n*F\n+ 1 Form.kt\ncom/planner5d/library/services/Form\n*L\n29#1:81,2\n41#1:83,2\n52#1:85,2\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f224478b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a[] f224479a;

    public interface a extends EditTextWithValidator.b {
        void f(@NotNull b bVar, @Nullable k3 k3Var);

        int getId();

        @Nullable
        String getValue();
    }

    public enum b {
        Error,
        Success;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f224483d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f224483d;
        }
    }

    private static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<String, Unit> f224484a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull Function1<? super String, Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f224484a = listener;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
            this.f224484a.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull a... fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f224479a = fields;
        for (Object[] objArr : fields) {
            if (objArr instanceof EditText) {
                ((TextView) objArr).addTextChangedListener(new c(new Function1() { // from class: com.planner5d.library.services.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.b(this.f224427a, (String) obj);
                    }
                }));
            }
            if (objArr instanceof com.planner5d.library.widget.k) {
                ((com.planner5d.library.widget.k) objArr).w(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.services.n
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                        o.a(this.f224440a, compoundButton, z10);
                    }
                });
            }
        }
    }

    public static void a(o oVar, CompoundButton compoundButton, boolean z10) {
        oVar.c();
    }

    public static Unit b(o oVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        oVar.c();
        return Unit.f312394a;
    }

    private final void c() {
        for (a aVar : this.f224479a) {
            aVar.f(b.Error, null);
        }
    }

    private final a d(int i10) {
        for (a aVar : this.f224479a) {
            if (aVar.getId() == i10) {
                return aVar;
            }
        }
        return null;
    }

    @NotNull
    public final String e(int i10) {
        String value;
        a aVarD = d(i10);
        return (aVarD == null || (value = aVarD.getValue()) == null) ? "" : value;
    }

    @Nullable
    public final Unit f(int i10, @NotNull k3 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        a aVarD = d(i10);
        if (aVarD == null) {
            return null;
        }
        aVarD.f(b.Error, message);
        return Unit.f312394a;
    }

    @Nullable
    public final Unit g(int i10, @NotNull k3 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        a aVarD = d(i10);
        if (aVarD == null) {
            return null;
        }
        aVarD.f(b.Success, message);
        return Unit.f312394a;
    }

    public final boolean h() {
        boolean z10 = true;
        int i10 = 5 & 1;
        for (a aVar : this.f224479a) {
            if (!aVar.validate()) {
                z10 = false;
            }
        }
        return z10;
    }
}

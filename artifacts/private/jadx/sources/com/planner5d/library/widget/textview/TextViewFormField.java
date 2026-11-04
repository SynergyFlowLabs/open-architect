package com.planner5d.library.widget.textview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.w0;
import androidx.core.content.d;
import com.planner5d.library.services.o;
import com.planner5d.library.services.q0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.EditTextWithValidator;
import com.planner5d.library.widget.c1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class TextViewFormField extends AppCompatTextView implements EditTextWithValidator.b, o.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258811c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q0.g<String>> f258812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f258813b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public TextViewFormField(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String getTextAsString() {
        CharSequence text = getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.planner5d.library.services.o.a
    public void f(@NotNull o.b type, @Nullable k3 k3Var) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // com.planner5d.library.services.o.a
    @Nullable
    public String getValue() {
        return getTextAsString();
    }

    public final void i(@NotNull q0.g<String> validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f258812a.add(validator);
    }

    @Override // android.widget.TextView
    public void setError(@Nullable CharSequence charSequence) {
        setTextColor(this.f258813b);
    }

    @Override // com.planner5d.library.widget.EditTextWithValidator.b
    public boolean validate() {
        setError(null);
        String textAsString = getTextAsString();
        Iterator<q0.g<String>> it = this.f258812a.iterator();
        while (it.hasNext()) {
            String strA = it.next().a(textAsString);
            if (strA != null) {
                setError(strA);
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public TextViewFormField(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextViewFormField(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public TextViewFormField(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f258812a = new LinkedList();
        this.f258813b = d.g(context, c1.e.f250732rf);
    }
}

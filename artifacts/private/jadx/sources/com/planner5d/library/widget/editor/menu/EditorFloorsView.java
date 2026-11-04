package com.planner5d.library.widget.editor.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.item.ItemProject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nEditorFloorsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorFloorsView.kt\ncom/planner5d/library/widget/editor/menu/EditorFloorsView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,56:1\n257#2,2:57\n*S KotlinDebug\n*F\n+ 1 EditorFloorsView.kt\ncom/planner5d/library/widget/editor/menu/EditorFloorsView\n*L\n48#1:57,2\n*E\n"})
public final class EditorFloorsView extends LinearLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f257025h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f257026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final View f257027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextView f257028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f257029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f257030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private a f257031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ItemProject f257032g;

    public interface a {
        void a();

        void b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public EditorFloorsView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EditorFloorsView editorFloorsView, View view) {
        a aVar = editorFloorsView.f257031f;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EditorFloorsView editorFloorsView, View view) {
        a aVar = editorFloorsView.f257031f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean c() {
        return this.f257030e;
    }

    public final void d(@NotNull ItemProject project, boolean z10, @NotNull a clickListener) {
        Intrinsics.checkNotNullParameter(project, "project");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f257030e = true;
        this.f257031f = clickListener;
        this.f257029d = z10;
        e(project);
    }

    public final void e(@NotNull ItemProject project) {
        Intrinsics.checkNotNullParameter(project, "project");
        this.f257032g = project;
        this.f257028c.setText(String.valueOf(project.getActiveFloorNumber() + 1));
        boolean z10 = !this.f257029d && project.getNumberOfFloors().intValue() < 3;
        this.f257026a.setVisibility(z10 ? 0 : 8);
        this.f257026a.setOnClickListener(z10 ? new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.menu.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditorFloorsView.f(this.f257076a, view);
            }
        } : null);
        this.f257027b.setOnClickListener((project.getNumberOfFloors().intValue() > 1 || !this.f257029d) ? new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.menu.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditorFloorsView.g(this.f257081a, view);
            }
        } : null);
    }

    public /* synthetic */ EditorFloorsView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public EditorFloorsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f257029d = true;
        View.inflate(context, com.planner5d.library.f.m.O6, this);
        this.f257026a = findViewById(com.planner5d.library.f.j.H1);
        this.f257027b = findViewById(com.planner5d.library.f.j.Ic);
        this.f257028c = (TextView) findViewById(com.planner5d.library.f.j.Jc);
    }
}

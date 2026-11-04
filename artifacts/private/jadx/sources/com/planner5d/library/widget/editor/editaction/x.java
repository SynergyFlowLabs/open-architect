package com.planner5d.library.widget.editor.editaction;

import androidx.annotation.NonNull;
import com.planner5d.library.widget.editor.helper.n3;

/* JADX INFO: loaded from: classes12.dex */
public class x extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f254805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n3 f254806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final id.a f254807d;

    public x(Long l10, String str, n3 n3Var, id.a aVar) {
        super(l10 == null ? null : String.valueOf(l10));
        this.f254807d = aVar;
        this.f254805b = str;
        this.f254806c = n3Var;
    }

    @Override // com.planner5d.library.widget.editor.editaction.e
    public void a(@NonNull h hVar) {
        this.f254806c.R(this.f254807d, this.f254756a, this.f254805b);
    }
}

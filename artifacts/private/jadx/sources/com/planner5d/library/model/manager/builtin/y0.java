package com.planner5d.library.model.manager.builtin;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import androidx.annotation.m1;
import com.planner5d.library.model.manager.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f181283f = "item";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f181284g = "category";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    protected i f181286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ij.a
    protected n1 f181287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.application.b f181288d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd.a f181285a = new xd.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pattern f181289e = Pattern.compile("^[0-9]{1,2}$");

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f181290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f181291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f181292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<String> f181293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<String> f181294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<String> f181295f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List<String> f181296g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f181297h;

        /* JADX INFO: Access modifiers changed from: private */
        public void j(String str) {
            this.f181294e.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(String str) {
            if (str.startsWith("category")) {
                this.f181295f.add(str.split(":")[1]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String l() {
            this.f181294e.clear();
            this.f181295f.clear();
            this.f181296g.clear();
            int i10 = this.f181297h;
            String[] strArr = this.f181292c;
            if (i10 >= strArr.length) {
                return null;
            }
            this.f181297h = i10 + 1;
            return strArr[i10];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean m() {
            if (this.f181294e.isEmpty()) {
                this.f181293d.clear();
                return false;
            }
            if (this.f181297h == 1) {
                this.f181293d.addAll(this.f181294e);
            } else {
                Iterator<String> it = this.f181293d.iterator();
                while (it.hasNext()) {
                    if (!this.f181294e.contains(it.next())) {
                        it.remove();
                    }
                }
            }
            return !this.f181293d.isEmpty();
        }

        private a(m mVar, String str, String[] strArr) {
            this.f181293d = new ArrayList();
            this.f181294e = new ArrayList();
            this.f181295f = new ArrayList();
            this.f181296g = new ArrayList();
            this.f181297h = 0;
            this.f181290a = mVar;
            this.f181291b = str;
            this.f181292c = strArr;
        }
    }

    @ij.a
    public y0() {
    }

    @m1
    private void a(a aVar, List<String> list, String str) {
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : list) {
            if (sb2.length() > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append('\'');
            sb2.append(str);
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(str2);
            sb2.append('\'');
        }
        Cursor cursorRawQuery = aVar.f181290a.a().rawQuery(String.format("SELECT id FROM %1$s WHERE name IN (%2$s)", i.b.search_index_ids.name(), sb2), null);
        while (cursorRawQuery.moveToNext()) {
            try {
                aVar.j(cursorRawQuery.getString(0));
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        cursorRawQuery.close();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    @m1
    private xd.b b(a aVar) {
        if (aVar.f181293d.isEmpty()) {
            return new xd.b();
        }
        Cursor cursorRawQuery = aVar.f181290a.a().rawQuery(String.format("SELECT name FROM %1$s WHERE id IN (%2$s)", i.b.search_index_ids.name(), TextUtils.join(",", aVar.f181293d)), null);
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                byte b10 = 0;
                String[] strArrSplit = cursorRawQuery.getString(0).split(":", 2);
                String str = strArrSplit[1];
                String str2 = strArrSplit[0];
                int iHashCode = str2.hashCode();
                if (iHashCode != 3242771) {
                    if (iHashCode == 50511102 && str2.equals("category")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (!str2.equals(f181283f)) {
                    b10 = -1;
                }
                if (b10 == 0) {
                    arrayList2.add(str);
                } else if (b10 == 1) {
                    arrayList.add(Long.valueOf(str));
                }
            }
            xd.b bVar = new xd.b(com.planner5d.library.services.utility.e.e(this.f181286b.y(arrayList2)), com.planner5d.library.services.utility.e.c(this.f181286b.u(arrayList)));
            cursorRawQuery.close();
            return bVar;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @m1
    private xd.b c(a aVar) throws Throwable {
        do {
            String strL = aVar.l();
            if (strL == null) {
                break;
            }
            e(aVar, f(aVar, strL));
            this.f181286b.F(aVar.f181295f, aVar.f181296g);
            a(aVar, aVar.f181296g, f181283f);
        } while (aVar.m());
        return b(aVar);
    }

    @m1
    private void e(a aVar, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        Cursor cursorRawQuery = aVar.f181290a.a().rawQuery(String.format("SELECT II.id, II.name FROM %1$s I LEFT JOIN %2$s II ON II.id = I.index_id WHERE I.word_id IN (%3$s) AND %4$s", i.b.search_index.name(), i.b.search_index_ids.name(), str, aVar.f181291b), null);
        while (cursorRawQuery.moveToNext()) {
            try {
                aVar.j(cursorRawQuery.getString(0));
                aVar.k(cursorRawQuery.getString(1));
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        cursorRawQuery.close();
    }

    @m1
    private String f(a aVar, String str) throws Throwable {
        String str2;
        if (this.f181289e.matcher(str).matches()) {
            str2 = String.format("(word LIKE '%1$s%%' OR word LIKE 's/%1$s%%')", str);
        } else {
            str2 = String.format("word LIKE %1$s", DatabaseUtils.sqlEscapeString("%" + str.replace("%", "%%") + "%"));
        }
        Cursor cursorRawQuery = aVar.f181290a.a().rawQuery(String.format("SELECT GROUP_CONCAT(id, ',') FROM %1$s WHERE %2$s", i.b.search_index_words.name(), str2), null);
        try {
            String string = cursorRawQuery.moveToNext() ? cursorRawQuery.getString(0) : null;
            cursorRawQuery.close();
            return string;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @m1
    public xd.b d(String str) throws Throwable {
        m mVarK = this.f181286b.K();
        try {
            xd.b bVarC = c(new a(mVarK, String.format("(language_id IS NULL OR language_id = %1$s) AND (catalog_id IS NULL OR catalog_id = %2$s)", this.f181287c.k(this.f181288d), Integer.valueOf(this.f181286b.v())), this.f181285a.b(str, true)));
            if (mVarK != null) {
                mVarK.close();
            }
            return bVarC;
        } catch (Throwable th2) {
            if (mVarK != null) {
                try {
                    mVarK.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}

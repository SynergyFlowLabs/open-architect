package com.planner5d.library.model.item.model2d;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.annotation.NonNull;
import com.planner5d.library.model.item.ItemMaterial;

/* JADX INFO: loaded from: classes7.dex */
public class Model2DPart {
    public static final int TYPE_ARC = 5;
    public static final int TYPE_CIRCLE = 3;
    public static final int TYPE_CURVE = 2;
    public static final int TYPE_ELLIPSE = 4;
    public static final int TYPE_LINE = 0;
    public static final int TYPE_SQUARE = 1;
    public final int fill;
    public final ItemMaterial material;
    public final Path path;
    public final int stroke;
    public final float strokeWidth;

    private Model2DPart(int i10, float f10, int i11, ItemMaterial itemMaterial, Path path) {
        this.stroke = i10;
        this.fill = i11;
        this.strokeWidth = f10;
        this.material = itemMaterial;
        this.path = path;
    }

    private static void addCubicOrLine(int i10, @NonNull int[] iArr, boolean z10, @NonNull Path path) {
        int i11 = i10 == 2 ? 0 : 2;
        path.moveTo(iArr[0], iArr[1]);
        while (i11 < iArr.length) {
            if (i10 == 2) {
                float f10 = iArr[i11];
                float f11 = iArr[i11 + 1];
                float f12 = iArr[i11 + 2];
                float f13 = iArr[i11 + 3];
                int i12 = i11 + 5;
                float f14 = iArr[i11 + 4];
                i11 += 6;
                path.cubicTo(f10, f11, f12, f13, f14, iArr[i12]);
            } else {
                Path path2 = path;
                int i13 = i11 + 1;
                float f15 = iArr[i11];
                i11 += 2;
                path2.lineTo(f15, iArr[i13]);
                path = path2;
            }
        }
        Path path3 = path;
        if (z10) {
            path3.close();
        }
    }

    private static Path createPath(int i10, int[] iArr, int[][] iArr2, boolean z10) {
        Path path = new Path();
        if (iArr2 != null) {
            for (int[] iArr3 : iArr2) {
                addCubicOrLine(i10, iArr3, z10, path);
            }
        }
        if (iArr != null && iArr.length >= 2) {
            if (i10 == 3) {
                int i11 = iArr[0];
                int i12 = iArr[1];
                path.addCircle(i11, i12, (float) distance(i11, i12, iArr[2], iArr[3]), Path.Direction.CCW);
                return path;
            }
            if (i10 == 4) {
                float fDistance = (float) distance(iArr[0], iArr[1], iArr[2], iArr[3]);
                float fDistance2 = (float) distance(iArr[0], iArr[1], iArr[4], iArr[5]);
                int i13 = iArr[0];
                int i14 = iArr[1];
                path.addOval(i13 - fDistance, i14 - fDistance2, i13 + fDistance, i14 + fDistance2, Path.Direction.CCW);
                return path;
            }
            if (i10 == 5) {
                path.arcTo(iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], false);
                return path;
            }
            addCubicOrLine(i10, iArr, z10, path);
        }
        return path;
    }

    private static double distance(float f10, float f11, float f12, float f13) {
        return Math.sqrt(Math.pow(f12 - f10, 2.0d) + Math.pow(f13 - f11, 2.0d));
    }

    private static float revampStrokeWidth(float f10) {
        if (f10 <= 1.0f) {
            return 0.5f;
        }
        return f10;
    }

    public int getFill(ItemMaterial[] itemMaterialArr) {
        ItemMaterial itemMaterial = this.material;
        if (itemMaterial != null) {
            int i10 = itemMaterial.position;
            Integer num = i10 < itemMaterialArr.length ? itemMaterialArr[i10].colorDraw : itemMaterial.colorDraw;
            if (num != null) {
                return (this.fill & (-16777216)) | (num.intValue() & 16777215);
            }
        }
        return this.fill;
    }

    public Model2DPart mutate(Matrix matrix) {
        Path path = new Path(this.path);
        path.transform(matrix);
        return new Model2DPart(this.stroke, this.strokeWidth, this.fill, this.material, path);
    }

    public Model2DPart mutateFill(int i10) {
        return new Model2DPart(this.stroke, this.strokeWidth, i10, this.material, new Path(this.path));
    }

    public Model2DPart mutateMaterial(ItemMaterial itemMaterial) {
        return new Model2DPart(this.stroke, this.strokeWidth, this.fill, itemMaterial, new Path(this.path));
    }

    public Model2DPart mutateStroke(int i10, float f10) {
        return new Model2DPart(i10, f10, this.fill, this.material, new Path(this.path));
    }

    public Model2DPart mutate(int i10, int[] iArr, int[][] iArr2, boolean z10) {
        return new Model2DPart(this.stroke, this.strokeWidth, this.fill, this.material, createPath(i10, iArr, iArr2, z10));
    }

    public Model2DPart mutate(Path path) {
        return new Model2DPart(this.stroke, this.strokeWidth, this.fill, this.material, new Path(path));
    }

    public Model2DPart(int i10, int[] iArr, int[][] iArr2, boolean z10, ItemMaterial itemMaterial, int i11, float f10, int i12) {
        this(i11, revampStrokeWidth(f10), i12, itemMaterial, createPath(i10, iArr, iArr2, z10));
    }
}

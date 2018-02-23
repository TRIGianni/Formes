package be.heh.Formes;

public abstract class Forme {

    protected float cote;
    protected int n;

    public Forme(float cote, int n)
    {
        this.cote = cote;
        this.n = n;
    }

    public float perimetre()
    {
        return this.cote*this.n;
    }

    public abstract float aire();
}

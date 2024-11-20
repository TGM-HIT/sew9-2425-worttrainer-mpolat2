/**
 * Speicherstrategie-Interface für das Speichern und Laden von RechtschreibTrainer
 * @author Polat Enes
 * @version 18.9.2024
 */
interface Speicherstrategie {
    /**
     * Speichern von einer Rechtschreibtrainer Liste
     * @param trainer Der Trainer
     */
    void save(Rechtschreibtrainer trainer);
    /**
     * Laden eines Rechtschreibtrainers basiert auf einer Liste
     * @return den Trainer
     */
    Rechtschreibtrainer load();
}
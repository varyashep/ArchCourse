package InMemoryModel;

// Интерфейс смены модели
public interface IModelChanger {
    public void NotifyChange(IModelChanger sender);
}

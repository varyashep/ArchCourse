package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.*;


public class ModelStore implements IModelChanger {

    public ModelStore(IModelChangedObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        models.add(new PoligonalModel(new ArrayList<Texture>()));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;

    // смена наблюдателя
    private IModelChangedObserver[] changeObservers;

    public Scene getScene(Integer id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
    }

    // Регистрирует изменения модели
    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
